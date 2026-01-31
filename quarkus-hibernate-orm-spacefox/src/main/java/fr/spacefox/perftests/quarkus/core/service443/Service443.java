package fr.spacefox.perftests.quarkus.core.service443;

import fr.spacefox.perftests.quarkus.core.port.data.Entity443DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service443.model.Model443;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service443 {

    private final Entity443DatasourcePort datasource;

    public Service443(Entity443DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model443 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
