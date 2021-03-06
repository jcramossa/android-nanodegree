/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2015-11-16 19:10:01 UTC)
 * on 2015-12-13 at 10:28:27 UTC 
 * Modify at your own risk.
 */

package com.example.hassanabid.myapplication.backend.myApi.model;

/**
 * Model definition for BeanJoke.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the myApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BeanJoke extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tellJokes;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTellJokes() {
    return tellJokes;
  }

  /**
   * @param tellJokes tellJokes or {@code null} for none
   */
  public BeanJoke setTellJokes(java.lang.String tellJokes) {
    this.tellJokes = tellJokes;
    return this;
  }

  @Override
  public BeanJoke set(String fieldName, Object value) {
    return (BeanJoke) super.set(fieldName, value);
  }

  @Override
  public BeanJoke clone() {
    return (BeanJoke) super.clone();
  }

}
