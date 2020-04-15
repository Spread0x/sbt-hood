/*
 * Copyright 2019-2020 47 Degrees Open Source <https://www.47deg.com>
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

package com.fortysevendeg.hood

import com.fortysevendeg.hood.model.{Benchmark, PrimaryMetric}

object TestValues {

  val excellentBenchmark = Benchmark(
    "test.decoding",
    "thrpt",
    PrimaryMetric(
      10,
      0.1,
      "love/s",
      List.empty
    )
  )

  val mehBenchmark = Benchmark(
    "test.decoding",
    "thrpt",
    PrimaryMetric(
      5,
      0.1,
      "love/s",
      List.empty
    )
  )

  val badBenchmark = Benchmark(
    "test.parsing",
    "thrpt",
    PrimaryMetric(
      1,
      0.1,
      "love/s",
      List.empty
    )
  )

}
