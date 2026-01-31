package fr.spacefox.perftests.quarkus.rest.endpoint753;

import fr.spacefox.perftests.quarkus.core.service753.model.Model753;
import fr.spacefox.perftests.quarkus.rest.endpoint753.schema.Schema753;

final class Mapper {
    private Mapper() {}

    public static Schema753 of(Model753 model) {
        return new Schema753(model.id(), model.value());
    }
}
