package fr.spacefox.perftests.quarkus.core.service688;

import fr.spacefox.perftests.quarkus.core.port.data.Entity688DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service688.model.Model688;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service688 {

    private final Entity688DatasourcePort datasource;

    public Service688(Entity688DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model688 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
