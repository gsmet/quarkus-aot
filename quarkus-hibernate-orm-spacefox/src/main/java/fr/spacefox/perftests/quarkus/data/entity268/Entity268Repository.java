package fr.spacefox.perftests.quarkus.data.entity268;

import fr.spacefox.perftests.quarkus.core.port.data.Entity268DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service268.model.Model268;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity268Repository implements Entity268DatasourcePort, PanacheRepository<Entity268> {
    @Override
    public Optional<Model268> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
