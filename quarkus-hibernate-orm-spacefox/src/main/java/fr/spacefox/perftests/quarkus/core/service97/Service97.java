package fr.spacefox.perftests.quarkus.core.service97;

import fr.spacefox.perftests.quarkus.core.port.data.Entity97DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service97.model.Model97;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service97 {

    private final Entity97DatasourcePort datasource;

    public Service97(Entity97DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model97 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
