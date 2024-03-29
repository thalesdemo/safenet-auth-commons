/**
 * Copyright 2023 safenet-auth-commons
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The ResponseCodeViews class defines the view classes for JSON serialization of the ResponseCode object.
 * It includes the Standard and WithCode classes that extend the Hidden class and are used for hiding
 * certain properties during JSON serialization.
 * 
 *  - The Standard view class is used for the default serialization of ResponseCode objects.
 *  - The WithCode view class is used for serialization of ResponseCode objects that include the numerical code.
 *
 * This class is not intended to be used directly, but rather to define the view classes for use with
 * JSON serialization in conjunction with the ResponseCode class.
 
 * @hidden
 * @see com.thalesdemo.safenet.auth.commons.responses.ResponseCode
 * @see com.fasterxml.jackson.annotation.JsonView
 *
 * @author Cina Shaykhian
 * @contact hello@onewelco.me
 */
package com.thalesdemo.safenet.auth.commons;

import io.swagger.v3.oas.annotations.Hidden;

public class ResponseCodeViews {
	/**
	 * The Standard view class is used for the default serialization of ResponseCode
	 * objects.
	 * It extends the Hidden class to hide certain properties during JSON
	 * serialization.
	 * 
	 * @hidden
	 */
	@Hidden
	public static class Standard {
	}

	/**
	 * The WithCode view class is used for serialization of ResponseCode objects
	 * that include the numerical code.
	 * It extends the Standard view class to include the code property during JSON
	 * serialization.
	 * 
	 * @hidden
	 */
	@Hidden
	public static class WithCode extends Standard {
	}
}