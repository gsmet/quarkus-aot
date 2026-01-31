package fr.spacefox.perftests.quarkus.rest.endpoint516;

import fr.spacefox.perftests.quarkus.core.service516.model.Model516;
import fr.spacefox.perftests.quarkus.rest.endpoint516.schema.Schema516;

final class Mapper {
    private Mapper() {}

    public static Schema516 of(Model516 model) {
        return new Schema516(model.id(), model.value());
    }
}
