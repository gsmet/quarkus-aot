package fr.spacefox.perftests.quarkus.data.entity42;

import fr.spacefox.perftests.quarkus.core.port.data.Entity42DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service42.model.Model42;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity42Repository implements Entity42DatasourcePort, PanacheRepository<Entity42> {
    @Override
    public Optional<Model42> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
