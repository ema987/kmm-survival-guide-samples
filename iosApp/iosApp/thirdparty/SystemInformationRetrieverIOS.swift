//
//  SystemInformationRetrieverIOS.swift
//  iosApp
//
//  Created by Emanuele on 18/09/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import shared

class SystemInformationRetrieverIOS: SystemInformationRetrieverNativeWrapper {
    
    //Assume the result of this method comes from using a third-party library
    func getSystemName() -> String {
        return "iOS"
    }
}
