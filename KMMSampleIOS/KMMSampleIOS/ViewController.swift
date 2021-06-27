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
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
         textLabel.text = Greeting().greeting()
    }


}

