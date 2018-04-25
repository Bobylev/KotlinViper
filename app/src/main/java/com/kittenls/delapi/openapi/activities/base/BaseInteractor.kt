package com.kittenls.delapi.openapi.activities.base

abstract class BaseInteractor<O : BaseContracts.InteractorOutput> : BaseContracts.Interactor {

    protected var output: O? = null

    @Suppress("UNCHECKED_CAST")
    override fun setInteractorOutput(interactorOutput: Any) {
        if (interactorOutput is BaseContracts.InteractorOutput) this.output = interactorOutput as O
    }

    override fun unregister() {
        this.output = null
    }

}