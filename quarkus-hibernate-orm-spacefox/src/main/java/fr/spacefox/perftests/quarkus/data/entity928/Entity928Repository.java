package fr.spacefox.perftests.quarkus.data.entity928;

import fr.spacefox.perftests.quarkus.core.port.data.Entity928DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service928.model.Model928;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity928Repository implements Entity928DatasourcePort, PanacheRepository<Entity928> {
    @Override
    public Optional<Model928> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
