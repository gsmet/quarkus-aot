package fr.spacefox.perftests.quarkus.rest.endpoint5;

import fr.spacefox.perftests.quarkus.core.service5.model.Model5;
import fr.spacefox.perftests.quarkus.rest.endpoint5.schema.Schema5;

final class Mapper {
    private Mapper() {}

    public static Schema5 of(Model5 model) {
        return new Schema5(model.id(), model.value());
    }
}
