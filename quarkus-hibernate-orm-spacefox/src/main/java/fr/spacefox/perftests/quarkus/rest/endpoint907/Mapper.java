package fr.spacefox.perftests.quarkus.rest.endpoint907;

import fr.spacefox.perftests.quarkus.core.service907.model.Model907;
import fr.spacefox.perftests.quarkus.rest.endpoint907.schema.Schema907;

final class Mapper {
    private Mapper() {}

    public static Schema907 of(Model907 model) {
        return new Schema907(model.id(), model.value());
    }
}
