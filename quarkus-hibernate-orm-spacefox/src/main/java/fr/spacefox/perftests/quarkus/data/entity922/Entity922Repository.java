package fr.spacefox.perftests.quarkus.data.entity922;

import fr.spacefox.perftests.quarkus.core.port.data.Entity922DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service922.model.Model922;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity922Repository implements Entity922DatasourcePort, PanacheRepository<Entity922> {
    @Override
    public Optional<Model922> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
