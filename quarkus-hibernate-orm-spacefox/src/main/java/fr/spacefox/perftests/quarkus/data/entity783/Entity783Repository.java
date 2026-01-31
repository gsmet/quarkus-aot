package fr.spacefox.perftests.quarkus.data.entity783;

import fr.spacefox.perftests.quarkus.core.port.data.Entity783DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service783.model.Model783;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity783Repository implements Entity783DatasourcePort, PanacheRepository<Entity783> {
    @Override
    public Optional<Model783> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
