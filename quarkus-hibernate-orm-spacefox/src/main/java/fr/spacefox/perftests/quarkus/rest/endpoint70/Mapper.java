package fr.spacefox.perftests.quarkus.rest.endpoint70;

import fr.spacefox.perftests.quarkus.core.service70.model.Model70;
import fr.spacefox.perftests.quarkus.rest.endpoint70.schema.Schema70;

final class Mapper {
    private Mapper() {}

    public static Schema70 of(Model70 model) {
        return new Schema70(model.id(), model.value());
    }
}
