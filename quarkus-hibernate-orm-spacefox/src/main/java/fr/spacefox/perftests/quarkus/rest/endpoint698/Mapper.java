package fr.spacefox.perftests.quarkus.rest.endpoint698;

import fr.spacefox.perftests.quarkus.core.service698.model.Model698;
import fr.spacefox.perftests.quarkus.rest.endpoint698.schema.Schema698;

final class Mapper {
    private Mapper() {}

    public static Schema698 of(Model698 model) {
        return new Schema698(model.id(), model.value());
    }
}
