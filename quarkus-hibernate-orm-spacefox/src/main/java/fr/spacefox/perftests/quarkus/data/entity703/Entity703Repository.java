package fr.spacefox.perftests.quarkus.data.entity703;

import fr.spacefox.perftests.quarkus.core.port.data.Entity703DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service703.model.Model703;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity703Repository implements Entity703DatasourcePort, PanacheRepository<Entity703> {
    @Override
    public Optional<Model703> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
