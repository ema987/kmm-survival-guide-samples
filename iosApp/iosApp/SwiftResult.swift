//
//  SwiftResult.swift
//  iosApp
//
//  Created by Emanuele on 16/09/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation

import shared

enum SwiftResult<Value> {
    case error(String)
    case success(Value)
}

func toSwiftResult<Value>(kmmResult: KMMResult<Value>) -> SwiftResult<Value> {
    if let successResult = kmmResult as? KMMResultSuccessKMMResult<Value> {
        return SwiftResult.success(successResult.value!)
    }
    if let errorResult = kmmResult as? KMMResultErrorKMMResult {
        return SwiftResult.error(errorResult.throwable.message ?? errorResult.throwable.description())
    }
    return SwiftResult.error("Unexpected error converting to SwiftResult")
}
