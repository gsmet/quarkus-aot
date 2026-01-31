package fr.spacefox.perftests.quarkus.rest.endpoint638;

import fr.spacefox.perftests.quarkus.core.service638.model.Model638;
import fr.spacefox.perftests.quarkus.rest.endpoint638.schema.Schema638;

final class Mapper {
    private Mapper() {}

    public static Schema638 of(Model638 model) {
        return new Schema638(model.id(), model.value());
    }
}
