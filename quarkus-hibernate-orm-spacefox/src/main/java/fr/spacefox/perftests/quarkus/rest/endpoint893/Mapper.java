package fr.spacefox.perftests.quarkus.rest.endpoint893;

import fr.spacefox.perftests.quarkus.core.service893.model.Model893;
import fr.spacefox.perftests.quarkus.rest.endpoint893.schema.Schema893;

final class Mapper {
    private Mapper() {}

    public static Schema893 of(Model893 model) {
        return new Schema893(model.id(), model.value());
    }
}
