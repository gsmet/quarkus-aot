package fr.spacefox.perftests.quarkus.data.entity138;

import fr.spacefox.perftests.quarkus.core.port.data.Entity138DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service138.model.Model138;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity138Repository implements Entity138DatasourcePort, PanacheRepository<Entity138> {
    @Override
    public Optional<Model138> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
