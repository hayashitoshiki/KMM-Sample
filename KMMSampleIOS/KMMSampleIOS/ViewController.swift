//
//  ViewController.swift
//  KMMSampleIOS
//
//  Created by 林敏生 on 2021/06/27.
//  Copyright © 2021 林敏生. All rights reserved.
//

import UIKit
import kmmsharedmodule

class ViewController: UIViewController {

    @IBOutlet weak var textLabel: UILabel!
    @IBOutlet weak var textLabe2: UILabel!
    @IBOutlet weak var textLabe3: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()

        let local = LocalHumanRepositoryImp()
        let usecase = HumanUseCaseImp(localHumanRepository: local)
        
        // 通常参照
        let human1 = usecase.bornHuman()
        let human1String1 = human1.age.description() + "," + human1.gender.name
        textLabel.text = human1String1
        // モジュール間参照(swift→kotlin→swift参照)
        let human2 = usecase.getHumanRandam()
        let human1String2 = human2.age.description() + "," + human2.gender.name
         textLabe2.text = human1String2
        // suspend参照
        usecase.getHumanFirst(
            completionHandler: {(human: Human?, error: Error?) in
                guard let human3 = human else { return }
                let human3String = human3.age.description() + "," + human3.gender.name
                self.textLabe3.text = human3String
        })
         
    
    }


}

