package fr.spacefox.perftests.quarkus.data.entity886;

import fr.spacefox.perftests.quarkus.core.service886.model.Model886;

final class Mapper {
    private Mapper() {}

    public static Model886 of(Entity886 entity) {
        return new Model886(entity.getId(), entity.getField());
    }
}
