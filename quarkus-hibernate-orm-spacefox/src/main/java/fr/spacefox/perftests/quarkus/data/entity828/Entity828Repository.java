package fr.spacefox.perftests.quarkus.data.entity828;

import fr.spacefox.perftests.quarkus.core.port.data.Entity828DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service828.model.Model828;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity828Repository implements Entity828DatasourcePort, PanacheRepository<Entity828> {
    @Override
    public Optional<Model828> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
