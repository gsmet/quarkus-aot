package fr.spacefox.perftests.quarkus.data.entity370;

import fr.spacefox.perftests.quarkus.core.port.data.Entity370DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service370.model.Model370;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity370Repository implements Entity370DatasourcePort, PanacheRepository<Entity370> {
    @Override
    public Optional<Model370> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
