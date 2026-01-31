package fr.spacefox.perftests.quarkus.rest.endpoint781;

import fr.spacefox.perftests.quarkus.core.service781.model.Model781;
import fr.spacefox.perftests.quarkus.rest.endpoint781.schema.Schema781;

final class Mapper {
    private Mapper() {}

    public static Schema781 of(Model781 model) {
        return new Schema781(model.id(), model.value());
    }
}
