package fr.spacefox.perftests.quarkus.core.service932;

import fr.spacefox.perftests.quarkus.core.port.data.Entity932DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service932.model.Model932;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service932 {

    private final Entity932DatasourcePort datasource;

    public Service932(Entity932DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model932 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
