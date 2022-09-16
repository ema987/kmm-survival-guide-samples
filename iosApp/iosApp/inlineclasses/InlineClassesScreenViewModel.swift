//
//  InlineClassesScreenViewModel.swift
//  iosApp
//
//  Created by Emanuele on 16/09/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import shared
import sharedSwift

class InlineClassesScreenViewModel: ObservableObject {
    
    @Published var state: InlineClassesScreenState = InlineClassesScreenState()
    
    func onShowMyNameClicked() {
        state.formattedName = ProfileFormatterKt.formatFirstAndLastName(firstName: FirstNameIos(firstName: "John"), lastName_: LastNameIos(lastName: "Doe"))
    }
    
    func onShowMyNameUsingInlineClassesClicked() {
        //Inline classes are converted to Any type, so any value can be passed as argument
        state.formattedNameUsingInlineClasses = ProfileFormatterKt.formatFirstAndLastName(firstName: "John", lastName: 123)
    }
    
}
