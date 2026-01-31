package fr.spacefox.perftests.quarkus.data.entity76;

import fr.spacefox.perftests.quarkus.core.port.data.Entity76DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service76.model.Model76;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity76Repository implements Entity76DatasourcePort, PanacheRepository<Entity76> {
    @Override
    public Optional<Model76> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
