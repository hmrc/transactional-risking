/*
 * Copyright 2022 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.transactionalrisking.controllers

import play.api.mvc.{Action, AnyContent, ControllerComponents}
import uk.gov.hmrc.play.bootstrap.backend.controller.BackendController
import uk.gov.hmrc.transactionalrisking.connectors.RiskDecisionConnector

import javax.inject.{Inject, Singleton}
import scala.concurrent.ExecutionContext

@Singleton()
class RiskDecisionController @Inject()(connector: RiskDecisionConnector, cc: ControllerComponents)(implicit ec: ExecutionContext)
    extends BackendController(cc) {

  def generateAssessment(): Action[AnyContent] = Action.async { implicit request =>
    connector.generateAssessment().map(Ok(_))
  }
}
