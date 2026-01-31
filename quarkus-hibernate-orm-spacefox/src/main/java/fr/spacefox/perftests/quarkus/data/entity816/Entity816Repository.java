package fr.spacefox.perftests.quarkus.data.entity816;

import fr.spacefox.perftests.quarkus.core.port.data.Entity816DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service816.model.Model816;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity816Repository implements Entity816DatasourcePort, PanacheRepository<Entity816> {
    @Override
    public Optional<Model816> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
