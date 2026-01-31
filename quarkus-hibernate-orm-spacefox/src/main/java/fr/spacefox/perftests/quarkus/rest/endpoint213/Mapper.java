package fr.spacefox.perftests.quarkus.rest.endpoint213;

import fr.spacefox.perftests.quarkus.core.service213.model.Model213;
import fr.spacefox.perftests.quarkus.rest.endpoint213.schema.Schema213;

final class Mapper {
    private Mapper() {}

    public static Schema213 of(Model213 model) {
        return new Schema213(model.id(), model.value());
    }
}
