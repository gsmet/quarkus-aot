package fr.spacefox.perftests.quarkus.data.entity256;

import fr.spacefox.perftests.quarkus.core.port.data.Entity256DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service256.model.Model256;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity256Repository implements Entity256DatasourcePort, PanacheRepository<Entity256> {
    @Override
    public Optional<Model256> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
