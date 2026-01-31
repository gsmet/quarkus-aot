package fr.spacefox.perftests.quarkus.data.entity564;

import fr.spacefox.perftests.quarkus.core.port.data.Entity564DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service564.model.Model564;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity564Repository implements Entity564DatasourcePort, PanacheRepository<Entity564> {
    @Override
    public Optional<Model564> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
