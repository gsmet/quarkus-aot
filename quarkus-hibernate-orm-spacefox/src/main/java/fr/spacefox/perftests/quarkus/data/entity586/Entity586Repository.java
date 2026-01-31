package fr.spacefox.perftests.quarkus.data.entity586;

import fr.spacefox.perftests.quarkus.core.port.data.Entity586DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service586.model.Model586;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity586Repository implements Entity586DatasourcePort, PanacheRepository<Entity586> {
    @Override
    public Optional<Model586> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
