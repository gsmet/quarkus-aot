package fr.spacefox.perftests.quarkus.data.entity600;

import fr.spacefox.perftests.quarkus.core.port.data.Entity600DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service600.model.Model600;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity600Repository implements Entity600DatasourcePort, PanacheRepository<Entity600> {
    @Override
    public Optional<Model600> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
