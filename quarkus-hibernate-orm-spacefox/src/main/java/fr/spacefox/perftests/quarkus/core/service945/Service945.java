package fr.spacefox.perftests.quarkus.core.service945;

import fr.spacefox.perftests.quarkus.core.port.data.Entity945DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service945.model.Model945;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service945 {

    private final Entity945DatasourcePort datasource;

    public Service945(Entity945DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model945 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
