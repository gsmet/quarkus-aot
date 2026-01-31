package fr.spacefox.perftests.quarkus.data.entity197;

import fr.spacefox.perftests.quarkus.core.service197.model.Model197;

final class Mapper {
    private Mapper() {}

    public static Model197 of(Entity197 entity) {
        return new Model197(entity.getId(), entity.getField());
    }
}
