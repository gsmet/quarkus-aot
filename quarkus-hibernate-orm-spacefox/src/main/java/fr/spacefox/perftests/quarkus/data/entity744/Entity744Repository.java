package fr.spacefox.perftests.quarkus.data.entity744;

import fr.spacefox.perftests.quarkus.core.port.data.Entity744DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service744.model.Model744;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity744Repository implements Entity744DatasourcePort, PanacheRepository<Entity744> {
    @Override
    public Optional<Model744> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
