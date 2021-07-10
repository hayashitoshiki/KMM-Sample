//
//  LocalHumanRepositoryImp.swift
//  KMMSampleIOS
//
//  Created by 林敏生 on 2021/07/10.
//  Copyright © 2021 林敏生. All rights reserved.
//

import Foundation
import kmmsharedmodule

//  iOS LocalHumanRepositoryの実装クラス
class LocalHumanRepositoryImp: LocalHumanRepository {
    func saveHuman(human: Human) {
        
    }
    func getHumanFirst() -> Human {
        return Human(gender: Gender.man, age: Age(value: 5))
    }
}
