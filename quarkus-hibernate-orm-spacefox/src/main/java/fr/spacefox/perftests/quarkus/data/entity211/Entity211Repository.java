package fr.spacefox.perftests.quarkus.data.entity211;

import fr.spacefox.perftests.quarkus.core.port.data.Entity211DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service211.model.Model211;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity211Repository implements Entity211DatasourcePort, PanacheRepository<Entity211> {
    @Override
    public Optional<Model211> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
