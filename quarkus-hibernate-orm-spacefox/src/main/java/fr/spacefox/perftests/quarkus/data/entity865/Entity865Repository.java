package fr.spacefox.perftests.quarkus.data.entity865;

import fr.spacefox.perftests.quarkus.core.port.data.Entity865DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service865.model.Model865;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity865Repository implements Entity865DatasourcePort, PanacheRepository<Entity865> {
    @Override
    public Optional<Model865> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
