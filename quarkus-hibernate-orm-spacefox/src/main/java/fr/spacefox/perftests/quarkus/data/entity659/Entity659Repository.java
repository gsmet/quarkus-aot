package fr.spacefox.perftests.quarkus.data.entity659;

import fr.spacefox.perftests.quarkus.core.port.data.Entity659DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service659.model.Model659;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity659Repository implements Entity659DatasourcePort, PanacheRepository<Entity659> {
    @Override
    public Optional<Model659> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
