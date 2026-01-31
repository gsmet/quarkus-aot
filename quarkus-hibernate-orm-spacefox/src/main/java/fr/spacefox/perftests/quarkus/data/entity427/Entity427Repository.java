package fr.spacefox.perftests.quarkus.data.entity427;

import fr.spacefox.perftests.quarkus.core.port.data.Entity427DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service427.model.Model427;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity427Repository implements Entity427DatasourcePort, PanacheRepository<Entity427> {
    @Override
    public Optional<Model427> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
