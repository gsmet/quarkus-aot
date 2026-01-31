package fr.spacefox.perftests.quarkus.data.entity41;

import fr.spacefox.perftests.quarkus.core.port.data.Entity41DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service41.model.Model41;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity41Repository implements Entity41DatasourcePort, PanacheRepository<Entity41> {
    @Override
    public Optional<Model41> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
