package fr.spacefox.perftests.quarkus.data.entity17;

import fr.spacefox.perftests.quarkus.core.port.data.Entity17DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service17.model.Model17;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity17Repository implements Entity17DatasourcePort, PanacheRepository<Entity17> {
    @Override
    public Optional<Model17> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
