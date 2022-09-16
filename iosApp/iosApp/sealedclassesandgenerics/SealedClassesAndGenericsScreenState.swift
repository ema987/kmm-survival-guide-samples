//
//  SealedClassesAndGenericsScreenState.swift
//  iosApp
//
//  Created by Emanuele on 16/09/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import shared
import sharedSwift

struct SealedClassesAndGenericsScreenState {
    var randomInt: Int32?
    var randomIntWrappedInIntResult: KMMIntResult?
    //This can't be Int32 because it's a struct
    var randomIntWrappedInResult: KMMResult<KotlinInt>?
    //Auto generated with moko-kswift
    var randomIntWrappedInResultKS: KMMResultKs<KotlinInt>?
}
