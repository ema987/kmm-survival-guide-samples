//
//  MainContentViewState.swift
//  iosApp
//
//  Created by Emanuele on 15/09/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import shared
import sharedSwift

struct MainContentViewState {
    var randomInt: Int32?
    var randomIntWrappedInIntResult: KMMIntResult?
    //This can't be Int32 because it's a struct
    var randomIntWrappedInResult: KMMResult<KotlinInt>?
    //Auto generated with moko-kswift
    var randomIntWrappedInResultKS: KMMResultKs<KotlinInt>?
}
