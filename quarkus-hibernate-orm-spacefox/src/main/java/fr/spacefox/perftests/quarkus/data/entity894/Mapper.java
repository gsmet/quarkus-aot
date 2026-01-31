package fr.spacefox.perftests.quarkus.data.entity894;

import fr.spacefox.perftests.quarkus.core.service894.model.Model894;

final class Mapper {
    private Mapper() {}

    public static Model894 of(Entity894 entity) {
        return new Model894(entity.getId(), entity.getField());
    }
}
