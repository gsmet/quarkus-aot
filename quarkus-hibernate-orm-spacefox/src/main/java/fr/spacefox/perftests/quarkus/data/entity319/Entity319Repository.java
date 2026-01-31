package fr.spacefox.perftests.quarkus.data.entity319;

import fr.spacefox.perftests.quarkus.core.port.data.Entity319DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service319.model.Model319;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity319Repository implements Entity319DatasourcePort, PanacheRepository<Entity319> {
    @Override
    public Optional<Model319> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
