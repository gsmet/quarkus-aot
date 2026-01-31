package fr.spacefox.perftests.quarkus.data.entity947;

import fr.spacefox.perftests.quarkus.core.port.data.Entity947DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service947.model.Model947;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity947Repository implements Entity947DatasourcePort, PanacheRepository<Entity947> {
    @Override
    public Optional<Model947> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
